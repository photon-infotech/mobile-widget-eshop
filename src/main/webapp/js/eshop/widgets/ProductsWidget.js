/*
 * ###
 * PHR_HTML5MobileWidget
 * %%
 * Copyright (C) 1999 - 2012 Photon Infotech Inc.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ###
 */
Event = YUI.event,
YUI.add("productsWidget", function(Y) {
    function ProductsWidget(config) {
        ProductsWidget.superclass.constructor.apply(this, arguments);
    }

    ProductsWidget.NAME = "productsWidget";

    ProductsWidget.ATTRS = {        
        targetNode : {
            value : []
        },
        onSelectedListeners : {
            value : []
        }
    };

    Y.extend(ProductsWidget, Y.Phresco.PhrescoWidget, {
        initializer: function() {
            /*
             * initializer is part of the lifecycle introduced by 
             * the Base class. It is invoked during construction,
             * and can be used to setup instance specific state or publish events which
             * require special configuration (if they don't need custom configuration, 
             * events are published lazily only if there are subscribers).
             *
             * It does not need to invoke the superclass initializer. 
             * init() will call initializer() for all classes in the hierarchy.
             */
             /* this.publish("myEvent", {
                defaultFn: this._defMyEventFn,
                bubbles:false
             }); */

        },

        destructor : function() {
            /*
             * destructor is part of the lifecycle introduced by 
             * the Widget class. It is invoked during destruction,
             * and can be used to cleanup instance specific state.
             *
             * Anything under the boundingBox will be cleaned up by the Widget base class
             * We only need to clean up nodes/events attached outside of the bounding Box
             *
             * It does not need to invoke the superclass destructor. 
             * destroy() will call initializer() for all classes in the hierarchy.
             */
        },

        render : function() {
            /*
             * render is part of the lifecycle introduced by the
             * Widget class. Widget's renderer method invokes:
             *
             *     render()
             *     bind()
             *     sync()
             *
             * render is intended to be used by the Widget subclass
             * to create or insert new elements into the DOM. 
             */       
            var jsonData = this.get("newproducts");
            this.createContent(this.getTargetNode());
        },

        bind : function() {
            /*
             * bind is intended to be used by the Widget subclass 
             * to bind any event listeners which will drive the Widget UI.
             * 
             * It will generally bind event listeners for attribute change
             * events, to update the state of the rendered UI in response 
             * to attribute value changes, and also attach any DOM events,
             * to activate the UI.
             */

            // this.after("attrAChange", this._afterAttrAChange);
        },

        sync : function() {
            /*
             * sync is intended to be used by the Widget subclass to
             * update the UI to reflect the initial state of the widget,
             * after render. From there, the event listeners we bound above
             * will take over.
             */

            // this._uiSetAttrA(this.get("attrA"));
        },

        captureData : function(jsonData) {
            this.createContent(this.getTargetNode(), jsonData);
            var target = this.get("targetNode");
            $(target).unmask();
        },

        createContent : function(targetNode, jsonData) {
            if (jsonData != null) {
                targetNode.empty();
                var apiRef = this.get("apiReference");
                apiRef.set("backPage", "Products");
                
                var url = apiRef.get("wsURLWithoutContext");
                var config = apiRef._getConfigData();
                var webImage = config.web.web;
                var productsList = this.createElement('<div class="cat_listerDetail">');
                var newProductsUL = this.createElement('<ul>');

                for (i = 0; i < jsonData.product.length; i++) {
                    var product = jsonData.product[i];
                    var imageURL = url + '/' + webImage + product.image;
                    var li = this.createElement('<li>');

                    var productsHolder = this.createElement('<div class="cat_listerDetail_bg">');
                    var productImage = Y.Node.create('<div class="cat_listerDetail_image"><a href="javascript:void(0);"><img src="' + imageURL + '" border="0" title="image" width="78" height"40"/></a></div>');
					productImage.obj = this;
                    productImage.data = product.id;
                    Y.on('click' , this.showProductDetails , productImage);
                    var productName = Y.Node.create('<div class="cat_listerDetail_imagetxt"><h3><a href="javascript:void(0);">' + product.name + '</a></h3>')
                    productName.obj = this;
                    productName.data = product.id;
                    Y.on('click' , this.showProductDetails , productName);
					
					var reviewDiv = this.createElement('<div class="cat_listerDetail_imagetxt">');
                    var reviewHolder = this.createElement('<div class="review_cont">');
                    var reviewContent = this.createElement('<div class="review_contleft">');
                    var price = this.createElement('<p>' + this.getAmount(product.listPrice, false, config.supportedCurrencies) + '</p>');
                    reviewContent.appendChild(price);
					
					var arrow = Y.Node.create('<div class="arrow"><a href="javascript:void(0);"><img src="images/eshop/arrow.png" border="0" title="image" /></a></div>');
					arrow.obj = this;
                    arrow.data = product.id;
                    Y.on('click' , this.showProductDetails , arrow);
                    var ratingDone = false;

                    for (var j = 0; j < 5; j++) {
                        var starImage = 'start.png';
                        if (product.rating == j) {
                            ratingDone = true;
                        }
                        if (ratingDone == true) {
                            starImage = 'start_dis.png';
                        }
                        var star = this.createElement('<span ><img src="images/eshop/' + starImage + '" border="0" title="image" /></span>');
                        reviewContent.appendChild(star);
                    }

                    var reviewButtonDiv = this.createElement('<div class="review_contright">');
                    var reviewButton = Y.Node.create('<a href="#"><img src="images/eshop/review.png" border="0" title="image" /></a></div>');
                    reviewButton.obj = this;
                    reviewButton.data = product.id;
                    Y.on('click' , this.getReviews , reviewButton);
                    
                    reviewButtonDiv.appendChild(reviewButton);
                    
                    reviewHolder.appendChild(reviewContent);
                    reviewHolder.appendChild(reviewButtonDiv);
					
					reviewDiv.appendChild(reviewHolder);
                    //productName.appendChild(reviewHolder);
                    productsHolder.appendChild(productImage);
                    productsHolder.appendChild(productName);
					productsHolder.appendChild(reviewDiv);
					productsHolder.appendChild(arrow);

                    li.appendChild(productsHolder);
					//li.appendChild(reviewHolder);
                    newProductsUL.appendChild(li);
                } 
                
                if (jsonData.length == 0) {
                    var productsUnavailable = this.createElement('<span>No products available</span>');        
                    targetNode.appendChild(productsUnavailable);
                } else {
                    productsList.appendChild(newProductsUL);
                    targetNode.appendChild(productsList);
                }
                
                if ($('#container').is(":visible")) {
                    this.renderWidgets();
                }
            } else {
                //var loading = this.createElement('<label>Loading...</label>');
                //targetNode.appendChild(loading);
            }
            
                /* for highlighting purpose */
                var specialbt = apiRef.get("special-tab");
              // console.info("specialbt", specialbt);
                if(specialbt == "special-tab"){
                    $('#browse-tab').removeClass("active");
                    $('#cart-tab').removeClass("active");
                    $('#special-tab').addClass("active");
                    
                    $('.footer li.spl_offer').addClass("spl_offer_active"); 
                    $('.footer li.browse').removeClass("browse_active");
                    $('.footer li.mycart').removeClass("mycart_active");
                    /* highlighting end */
                }
            $(document).ready(function(){
                var myScroll = new iScroll('scroller');
                document.addEventListener('touchmove', function (e) { e.preventDefault(); }, false);
                document.addEventListener('DOMContentLoaded', myScroll, false);
            });
                
        },
  
        onUpdateListener: function(jsonData) {
            this.captureData(jsonData);
        },
        hideWidgets : function (hideWidgets) {
            this.set("hideWidgets", hideWidgets);
        }
    });

    Y.namespace("Phresco").ProductsWidget = ProductsWidget;
}, "3.3.0", {
    requires:["widget", "node", "substitute"]
});

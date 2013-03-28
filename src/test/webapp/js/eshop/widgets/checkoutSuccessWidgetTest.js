﻿YUI.add('checkoutSuccessWidgetTest', function(Y) {				//create the test suite		var suite = new Y.Test.Suite("CheckoutSuccessWidgetTest");		//add test cases		var wsConfig = new Y.Phresco.WSConfig();		var testCase = new Y.Test.Case({			name: "CheckoutSuccessWidgetTest",			"CheckoutSuccessWidgetTest with same data": function () {				wsConfig.getWsConfig(function(response){					var eshopapi = new Y.Phresco.EShopAPI(response);					var phrescoWidget = new Y.Phresco.PhrescoWidget(response);					var helloNode = Y.Node.create('<div id="container"></div>');					// instantiate SliderWidget with the HTML					var checkoutSuccessWidget = new Y.Phresco.CheckoutSuccessWidget({						// place holder can be decided by specifying the attribute						targetNode : helloNode,						apiReference : eshopapi				   });					checkoutSuccessWidget.render();					var output1 = checkoutSuccessWidget.getTargetNode().get('innerHTML');										var targetNode = phrescoWidget.createElement('<div></div>');					targetNode.empty();					var mycart = phrescoWidget.createElement('<div class="mycart_div">');					var mycart_head = phrescoWidget.createElement('<div class="mycart_head">Order Status</div>');                					var emailblock = phrescoWidget.createElement('<div class="status_cond">');					var emailblocksub = phrescoWidget.createElement('<div class="status_inner_div">');					var emailblocksubp1 = phrescoWidget.createElement('<p>Order Status Message</p>');					var emailblocksubp2 = phrescoWidget.createElement('<p class="text">Your order is complete!</p>');					var emailblocksubp3 = phrescoWidget.createElement('<p class="text">Your order number is XXX.</p>');               					var emailblocksubp4 = phrescoWidget.createElement('<p class="text">Thanking you for shopping at Phresco. While logged in. You may continue shopping or view your order status and order.</p>');				 					emailblocksub.appendChild(emailblocksubp1);					emailblocksub.appendChild(emailblocksubp2);					emailblocksub.appendChild(emailblocksubp3);					emailblocksub.appendChild(emailblocksubp4);					emailblock.appendChild(emailblocksub); 					mycart.appendChild(mycart_head);        					mycart.appendChild(emailblock);                     					targetNode.appendChild(mycart);					var output2 = targetNode.get('innerHTML');					Y.Assert.areEqual(output1, output2, "CheckoutSuccessWidget Success case");				});			},						"CheckoutFormViewWidgetTest with different data": function () {				wsConfig.getWsConfig(function(response){					var eshopapi = new Y.Phresco.EShopAPI(response);					var phrescoWidget = new Y.Phresco.PhrescoWidget(response);					var helloNode = Y.Node.create('<div id="container"></div>');					// instantiate SliderWidget with the HTML					var checkoutSuccessWidget = new Y.Phresco.CheckoutSuccessWidget({						// place holder can be decided by specifying the attribute						targetNode : helloNode,						apiReference : eshopapi					});					checkoutSuccessWidget.render();					var output1 = checkoutSuccessWidget.getTargetNode().get('innerHTML');										var targetNode = phrescoWidget.createElement('<div></div>');					targetNode.empty();					var mycart = phrescoWidget.createElement('<div class="mycart_div">');					var mycart_head = phrescoWidget.createElement('<div class="mycart_head">Order Status</div>');                					var emailblock = phrescoWidget.createElement('<div class="status_cond">');					var emailblocksub = phrescoWidget.createElement('<div class="status_inner_div2">');					var emailblocksubp1 = phrescoWidget.createElement('<p>Order Status Message</p>');					var emailblocksubp2 = phrescoWidget.createElement('<p class="text">Your order is complete!</p>');					var emailblocksubp3 = phrescoWidget.createElement('<p class="text">Your order number is XXX.</p>');               					var emailblocksubp4 = phrescoWidget.createElement('<p class="text">Thanking you for shopping at Phresco. While logged in. You may continue shopping or view your order status and order.</p>');				 					emailblocksub.appendChild(emailblocksubp1);					emailblocksub.appendChild(emailblocksubp2);					emailblocksub.appendChild(emailblocksubp3);					emailblocksub.appendChild(emailblocksubp4);					emailblock.appendChild(emailblocksub); 					mycart.appendChild(mycart_head);        					mycart.appendChild(emailblock);                     					targetNode.appendChild(mycart);				var output2 = targetNode.get('innerHTML');									Y.Assert.areNotEqual(output1, output2, "CheckoutSuccessWidget Failure case");				});			}		});		suite.add(testCase);		Y.Test.Runner.add(suite);	});
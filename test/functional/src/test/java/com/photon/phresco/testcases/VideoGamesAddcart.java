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
package com.photon.phresco.testcases;

import java.io.IOException;

import junit.framework.TestCase;
import org.junit.Test;
import org.openqa.selenium.server.SeleniumServer;
import com.photon.phresco.Screens.MenuScreen;
import com.photon.phresco.Screens.WelcomeScreen;
import com.photon.phresco.uiconstants.MobilewidgUiConstants;
import com.thoughtworks.selenium.Selenium;

public class VideoGamesAddcart extends TestCase {


	private MobilewidgUiConstants phrsc;
	private WelcomeScreen wel;
	private int SELENIUM_PORT;
	private String browserAppends;
	//private LoginScreen loginObject;
	//private Log log = LogFactory.getLog(getClass());
    String methodName;
	@Test
	public void testVideoGames() throws InterruptedException, IOException, Exception {

		try {

			phrsc = new MobilewidgUiConstants();
			String serverURL = phrsc.PROTOCOL + "://"
					+ phrsc.HOST + ":"
					+ phrsc.PORT + "/";
			browserAppends = "*" + phrsc.BROWSER;
			assertNotNull("Browser name should not be null",browserAppends);
			SELENIUM_PORT = Integer.parseInt(phrsc.SERVER_PORT);
			assertNotNull("selenium-port number should not be null",
					SELENIUM_PORT);
			wel=new WelcomeScreen(phrsc.SERVER_HOST, SELENIUM_PORT,
					browserAppends, serverURL, phrsc.SPEED,
					phrsc.CONTEXT );
			assertNotNull(wel);
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
			System.out.println("methodName = " + methodName);
			MenuScreen menu = wel.menuScreen(phrsc,methodName);
			menu.VideoGames(methodName);
			menu.BillingInfo(methodName);
		} catch (Exception t) {
			t.printStackTrace();
			System.out.println("ScreenCaptured");
			
		}
	}

	public void setUp() throws Exception {
		phrsc = new MobilewidgUiConstants();
	}

	public void tearDown() {
		clean();
	}

	private void clean() {
		wel.closeBrowser();
	}

}
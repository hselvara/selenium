/**
 * Copyright (c) 2015 by Cisco Systems, Inc.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Cisco Systems,  ("Confidential Information").  You
 * shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement
 * you entered into with Cisco Systems.
 *
 *
 * @Project: Utils
 * @Author: smuniapp
 * @Version: 
 * @Description:  
 * @Date created: Apr 9, 2015
 */
package com.cisco.dbds.utils.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * The Class CucumberFeaturesIT.
 */
@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, strict = true, features = { "src/it/resources/", }, glue = { "com.cisco", }, format = {
		"pretty", "html:target/reports",
"json:target/reports/cucumber-report.json" })
public class CucumberFeaturesIT {

}
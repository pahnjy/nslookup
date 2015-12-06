package com.pineone.code.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pahnj on 2015-12-06.
 */
@RestController
public class NsLookUpController {


    @Autowired
    INsLookUp nsLookUp;

    @RequestMapping(value = "/nslookup", method = RequestMethod.POST)
    public String dataProtocalController(@RequestBody String address) {

        return nsLookUp.getAddress(address);
    }

}

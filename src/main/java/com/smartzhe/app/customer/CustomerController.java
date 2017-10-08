package com.smartzhe.app.customer;

import com.smartzhe.app.config.MyConfig;
import com.smartzhe.app.exception.BizException;
import com.smartzhe.app.exception.BizExceptionType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by luohuahua on 17/10/7.
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private static Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private MyConfig myConfig;

    @RequestMapping("/get")
    public Customer get(@RequestParam(name = "id") Integer id){

        Customer customer = new Customer();
        customer.setId(id);
        customer.setName("john"+id);
        int i = 12/0;
        return customer;
    }

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public Customer getUser(@PathVariable Integer id) {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName("customer");
        logger.info(myConfig.getName()+"=======");
        throw new BizException(BizExceptionType.BIZ_EXCEPTION_CUSTOMER_NOT_UNIQUE_NAME);
        //return customer;
    }
}

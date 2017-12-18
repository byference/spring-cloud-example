package com.bfh.controller;

import com.bfh.client.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Author: bfh
 * Date: 2017/12/13
 */
@RestController
public class DcController {

	@Autowired
	private DcClient dcClient;

	@GetMapping("/consumer")
	public String dc() {
		return dcClient.consumer();
	}
}
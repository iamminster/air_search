package minh.nguyen.eas.air.search.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchController {

	public SearchController() {
	}
	
	@RequestMapping(value = "/lowfares")
    public String getLowFares() {
		return "lowfare search";
	}

	@RequestMapping(value = "/productdetails")
    public String getProductDetails() {
		return "product details";
	}

}

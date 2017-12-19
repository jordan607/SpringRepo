
package com.spring.social.twitter;

import javax.inject.Inject;

import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TwitterTrendsController {
	
	// Yahoo Where On Earth ID representing the entire world
	private static final long WORLDWIDE_WOE = 1L;
	
	private final Twitter twitter;

	@Inject
	public TwitterTrendsController(Twitter twitter) {
		this.twitter = twitter;
	}

	@RequestMapping(value="/twitter/trends", method=RequestMethod.GET)
	public String showTrends(Model model) {
		model.addAttribute("trends", twitter.searchOperations().getLocalTrends(WORLDWIDE_WOE));
		return "twitter/trends";
	}
	
}

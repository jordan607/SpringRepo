
package com.spring.social.twitter;

import javax.inject.Inject;

import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TwitterSearchController {

	private final Twitter twitter;
	
	@Inject
	public TwitterSearchController(Twitter twitter) {
		this.twitter = twitter;
	}

	@RequestMapping(value="/twitter/search", method=RequestMethod.GET)
	public String showTrends(@RequestParam("query") String query, Model model) {
		model.addAttribute("timeline", twitter.searchOperations().search(query).getTweets());
		return "twitter/timeline";
	}
	
}

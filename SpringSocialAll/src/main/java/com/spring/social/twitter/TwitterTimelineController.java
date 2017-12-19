
package com.spring.social.twitter;

import javax.inject.Inject;

import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TwitterTimelineController {

	private final Twitter twitter;
	
	@Inject
	public TwitterTimelineController(Twitter twitter) {
		this.twitter = twitter;
	}
	
	@RequestMapping(value="/twitter/timeline", method=RequestMethod.GET)
	public String showTimeline(Model model) {
		return showTimeline("Home", model);
	}
	
	@RequestMapping(value="/twitter/timeline/{timelineType}", method=RequestMethod.GET)
	public String showTimeline(@PathVariable("timelineType") String timelineType, Model model) {
		if (timelineType.equals("Home")) {
			model.addAttribute("timeline", twitter.timelineOperations().getHomeTimeline());
		} else if(timelineType.equals("User")) {
			model.addAttribute("timeline", twitter.timelineOperations().getUserTimeline());
		} else if(timelineType.equals("Mentions")) {
			model.addAttribute("timeline", twitter.timelineOperations().getMentions());
		} else if(timelineType.equals("Favorites")) {
			model.addAttribute("timeline", twitter.timelineOperations().getFavorites());
		}
		model.addAttribute("timelineName", timelineType);
		return "twitter/timeline";
	}
	

	@RequestMapping(value="/twitter/tweet", method=RequestMethod.POST)
	public String postTweet(String message) {
		twitter.timelineOperations().updateStatus(message);
		return "redirect:/twitter";
	}

}

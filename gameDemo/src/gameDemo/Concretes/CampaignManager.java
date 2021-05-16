package gameDemo.Concretes;

import gameDemo.Abstract.CampaignService;
import gameDemo.Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanyas� eklendi");
		
	}

	@Override
	public void upddate(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanyas� g�ncellendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanyas� silindi");
		
	}

}

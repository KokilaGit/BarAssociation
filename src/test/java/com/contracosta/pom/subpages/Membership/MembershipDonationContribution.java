package com.contracosta.pom.subpages.Membership;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.contracosta.pom.utils.PageUtilities;

public class MembershipDonationContribution {
	WebDriver driver;
	WebElement donationChbx;
	WebElement donationAmount;

	public MembershipDonationContribution(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void setDonationChbx(String label) {
		if (PageUtilities.valueNotEmpty(label)) {
			this.donationChbx = PageUtilities.getInputByLabel(this.driver, label);
			PageUtilities.setCheckBox("Yes", donationChbx);
		}

	}

	public void setDonationAmountText(String label, String amount) {
		if (PageUtilities.valueNotEmpty(label)) {
			this.donationAmount = PageUtilities.getInputFollowingLabel(this.driver, label);
			this.donationAmount.clear();
			this.donationAmount.sendKeys(amount);
		}
	}

	public void setDonationInfo(String donationChbxs) {
		if (PageUtilities.valueNotEmpty(donationChbxs)) {

			// data will come as (jfjdk|200,test|100,)
			String[] arrOfDonationTuple = donationChbxs.split(",", 0);

			// each tuple will contain (jfjdk|200) checkboxtext and amount.
			for (String tuple : arrOfDonationTuple) {
				String[] listChbxAmount = tuple.split("[|]", 0);
				System.out.println(listChbxAmount[0] + " " + listChbxAmount[1]);
				if (listChbxAmount.length == 2) {
					this.setDonationChbx(listChbxAmount[0]);
					this.setDonationAmountText(listChbxAmount[0], listChbxAmount[1]);
				}

			}
		}
	}

}

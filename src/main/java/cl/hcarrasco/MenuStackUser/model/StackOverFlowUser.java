package cl.hcarrasco.MenuStackUser.model;

import java.util.List;


public class StackOverFlowUser {
	
	private List<Items> items;
	
	private boolean hasMore;
	private int quotaMax;
	private int quotaRemaining;
	
	public List<Items> getItems() {
        return items;
    }

    public void setitems(List<Items> items) {
        this.items = items;
    }
		
	public boolean isHasMore() {
		return hasMore;
	}
	public void setHasMore(boolean hasMore) {
		this.hasMore = hasMore;
	}
	public int getQuotaMax() {
		return quotaMax;
	}
	public void setQuotaMax(int quotaMax) {
		this.quotaMax = quotaMax;
	}
	public int getQuotaRemaining() {
		return quotaRemaining;
	}
	public void setQuotaRemaining(int quotaRemaining) {
		this.quotaRemaining = quotaRemaining;
	}
	
	public class Items{
		
		private Badges badge_counts;
		private int account_id;
		private boolean is_employee;
		private long last_modified_date;
		private long last_access_date;
		private int age;
		private int reputation_change_year;
		private int reputation_change_quarter;
		private int reputation_change_month;
		private int reputation_change_week;
		private int reputation_change_day;
		private int reputation;
		private int creation_date;
		private String user_type;
		private int user_id;
		private int accept_rate;
		private String location;
		private String website_url;
		private String link;
		private String profile_image;
		private String display_name; 
	
		public class Badges{
			private int bronze;
			private int silver;
			private int gold;
			
			public int getBronze() {
				return bronze;
			}
			public void setBronze(int bronze) {
				this.bronze = bronze;
			}
			public int getSilver() {
				return silver;
			}
			public void setSilver(int silver) {
				this.silver = silver;
			}
			public int getGold() {
				return gold;
			}
			public void setGold(int gold) {
				this.gold = gold;
			}
		}

		public Badges getBadge_counts() {
			return badge_counts;
		}

		public void setBadge_counts(Badges badge_counts) {
			this.badge_counts = badge_counts;
		}

		public int getAccount_id() {
			return account_id;
		}

		public void setAccount_id(int account_id) {
			this.account_id = account_id;
		}

		public boolean isIs_employee() {
			return is_employee;
		}

		public void setIs_employee(boolean is_employee) {
			this.is_employee = is_employee;
		}

		public long getLast_modified_date() {
			return last_modified_date;
		}

		public void setLast_modified_date(long last_modified_date) {
			this.last_modified_date = last_modified_date;
		}

		public long getLast_access_date() {
			return last_access_date;
		}

		public void setLast_access_date(long last_access_date) {
			this.last_access_date = last_access_date;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getReputation_change_year() {
			return reputation_change_year;
		}

		public void setReputation_change_year(int reputation_change_year) {
			this.reputation_change_year = reputation_change_year;
		}

		public int getReputation_change_quarter() {
			return reputation_change_quarter;
		}

		public void setReputation_change_quarter(int reputation_change_quarter) {
			this.reputation_change_quarter = reputation_change_quarter;
		}

		public int getReputation_change_month() {
			return reputation_change_month;
		}

		public void setReputation_change_month(int reputation_change_month) {
			this.reputation_change_month = reputation_change_month;
		}

		public int getReputation_change_week() {
			return reputation_change_week;
		}

		public void setReputation_change_week(int reputation_change_week) {
			this.reputation_change_week = reputation_change_week;
		}

		public int getReputation_change_day() {
			return reputation_change_day;
		}

		public void setReputation_change_day(int reputation_change_day) {
			this.reputation_change_day = reputation_change_day;
		}

		public int getReputation() {
			return reputation;
		}

		public void setReputation(int reputation) {
			this.reputation = reputation;
		}

		public int getCreation_date() {
			return creation_date;
		}

		public void setCreation_date(int creation_date) {
			this.creation_date = creation_date;
		}

		public String getUser_type() {
			return user_type;
		}

		public void setUser_type(String user_type) {
			this.user_type = user_type;
		}

		public int getUser_id() {
			return user_id;
		}

		public void setUser_id(int user_id) {
			this.user_id = user_id;
		}

		public int getAccept_rate() {
			return accept_rate;
		}

		public void setAccept_rate(int accept_rate) {
			this.accept_rate = accept_rate;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getWebsite_url() {
			return website_url;
		}

		public void setWebsite_url(String website_url) {
			this.website_url = website_url;
		}

		public String getLink() {
			return link;
		}

		public void setLink(String link) {
			this.link = link;
		}

		public String getProfile_image() {
			return profile_image;
		}

		public void setProfile_image(String profile_image) {
			this.profile_image = profile_image;
		}

		public String getDisplay_name() {
			return display_name;
		}

		public void setDisplay_name(String display_name) {
			this.display_name = display_name;
		}
	}
	
}

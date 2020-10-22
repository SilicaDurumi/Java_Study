package EnumExample;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public enum PaymentEnum {
		CASH("Cash", Arrays.asList("DIRECT","MAIN","SUB")),
		CARD("Credit_Card", Arrays.asList("DIRECT","DIVIDE")),
		ETC("ETC", Arrays.asList("Coupon")),
		EMPTY("NONE", Collections.EMPTY_LIST);
		
		private String title;
		private List<String> payList;
	
		PaymentEnum(String title, List<String> payList) {
			this.title = title;
			this.payList = payList;
		}
		
		public static PaymentEnum FindByPayCode(String code) {
			return Arrays.stream(PaymentEnum.values()).
					filter(PaymentEnum -> PaymentEnum.hasPayCode(code)).
					findAny().orElse(EMPTY);
		}
		
		public boolean hasPayCode(String code) {
			return payList.stream().anyMatch(pay -> pay.equals(code));
		}
		

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public List<String> getPayList() {
			return payList;
		}

		public void setPayList(List<String> payList) {
			this.payList = payList;
		}
		


}
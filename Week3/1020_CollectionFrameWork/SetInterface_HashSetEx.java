import java.util.HashSet;
import java.util.Set;

public class SetInterface_HashSetEx {
	public static void main(String[] args) {
		Set<Member> member_Set = new HashSet<Member>();
		
		Member membersomeone01 = new Member("ABC", 10, "1234567");
		Member membersomeone02 = new Member("ABC", 10, "1234567");
		
		member_Set.add(membersomeone01);
		member_Set.add(membersomeone02);
		
		System.out.println(member_Set.size());
		
		System.out.println(membersomeone01.hashCode());
		System.out.println(membersomeone02.hashCode());
		
		System.out.println(membersomeone01.equals(membersomeone02));
		
	}
}

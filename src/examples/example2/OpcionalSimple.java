package examples.example2;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OpcionalSimple {


	public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

		OpcionalSimple o = new OpcionalSimple();
		
		String a = "";
		String b = null;
		String c = "Test";

		System.out.println(o.returnEmptyIfEmptyOld(a));
		System.out.println(o.returnEmptyIfEmptyOld(b));
		System.out.println(o.returnEmptyIfEmptyOld(c));

		System.out.println(o.returnEmptyIfEmptyNew(a));
		System.out.println(o.returnEmptyIfEmptyNew(b));
		System.out.println(o.returnEmptyIfEmptyNew(c));
	}
	
	public String returnEmptyIfEmptyOld(String str) {
		if (str == null || str.equals("")) {
			return "Empty";
		} else {
			return str;
		}
	}

	public String returnEmptyIfEmptyNew(String str) {
		return Optional.ofNullable(str)
				.filter(val -> !val.equals(""))
				.orElse("Empty");
	}
	
	public String returnEmptyIfEmptyNameBetween(String str) {
		Optional<String> optional = Optional.ofNullable(str);

		if (!optional.isPresent() || optional.get().equals("")) {
			return "Empty";
		} else {
			return str;
		}		
	}
}

package section9.interfaces.challenge2;

import java.util.List;

public interface ISavable {
	
	List<String> write();
	void read(List<String> savedValues);

}

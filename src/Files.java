import java.io.File;
import java.nio.file.Path;

public class Files {
	public final String userName = System.getProperty("user.name");
	public final String pathLocation = "/Users/" + userName + "/documents/Music";

	public File f = new File(pathLocation);


	public boolean checkFolder() {
		if (f.exists()) {
			return true;
		}
		return false;
	}

	public void createFolder() {
		try {
			if (f.mkdir()) {
				System.out.println("Directory Created");
			} else {
				System.out.println("Directory is not created");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void firstTimeSetup() {
		if (checkFolder() == false) {
			createFolder();
		} else {
			System.out.println("User already has folder");
		}
	}

	public String compiledPathLocation(String songName) {
		String compiledPathLocation = "";

		compiledPathLocation += pathLocation + "/" + songName;

		System.out.println(compiledPathLocation);
		return compiledPathLocation;
	}
	
	public File getF() {
		return f;
	}

	public void setF(File f) {
		this.f = f;
	}
}

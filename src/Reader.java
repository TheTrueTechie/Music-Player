import java.io.File;
import java.util.ArrayList;

public class Reader {
	Files files = new Files();
	public void readFiles(final File folder) {
		for (final File fileEntry : folder.listFiles()) {
			if (fileEntry.isDirectory()) {
				readFiles(fileEntry);
			} else {
				System.out.println(fileEntry.getName());
			}
		}

	}

	public ArrayList<MP3s> getCompliedSongsForMP3s() {
		ArrayList<MP3s> musicList = new ArrayList<MP3s>(); 
		for (int i = 0; i < getCompliedSongsForArray().length; i++) {
			musicList.add(new MP3s(files.compiledPathLocation(getCompliedSongsForArray()[i]))); 
		}
		
		return musicList;
	
	}

	public String[] getCompliedSongsForArray() {
		String[] musicList = files.getF().list(); 
//		for (int i = 0; i < musicList.length; i++) {
//			System.out.println(musicList[i]);
//		}
		return musicList;
	}
}

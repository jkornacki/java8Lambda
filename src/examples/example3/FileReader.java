package examples.example3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileReader {

	public List<Line> readFileOldWay(File f) throws IOException {
		List<Line> res = new ArrayList<Line>();
		FileInputStream fis = new FileInputStream(f);

		try (BufferedReader br = new BufferedReader(new InputStreamReader(fis))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				res.add(new Line(line));
			}
		}
		return res;
	}

	public void readFileNewWay(File f) throws IOException {
		Files.lines(Paths.get(f.toURI()))
					.map(l -> new Line(l))
					.collect(Collectors.toList());
	}
}

final class Line {
	private String line;

	public Line(String line) {
		super();
		this.line = line;
	}

	public String getLine() {
		return line;
	}

}
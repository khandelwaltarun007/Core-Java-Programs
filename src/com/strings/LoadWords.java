package com.strings;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class LoadWords {
public static void main(String[] args) throws IOException {
	List<String> list = Files.readAllLines(new File("C:\\Users\\A631079\\Downloads\\words.txt").toPath(), Charset.defaultCharset());
	list.stream().forEach(i->System.out.println(i));
}
}

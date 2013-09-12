package tn.di.writer;

import org.springframework.stereotype.Service;

@Service
public class NiceWriter implements IWriter {

	public void writer(String s) {
		System.out.println("Nice: " + s);
	}

}

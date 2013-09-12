package tn.di.writer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.di.writer.IWriter;

@Service
public class PrintingService {

	private IWriter writer;

	@Autowired
	public void setWriter(IWriter writer) {
		this.writer = writer;
	}

	public void run() {
		String s = "This is my test";
		writer.writer(s);
	}
}

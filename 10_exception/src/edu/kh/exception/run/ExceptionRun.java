
package edu.kh.exception.run;

import edu.kh.exception.service.ExceptionService;

public final class ExceptionRun {
	public static void main(String[] args) {
		ExceptionService service = new ExceptionService();
		service.ex3();
	}
}

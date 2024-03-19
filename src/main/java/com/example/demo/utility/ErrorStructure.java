package com.example.demo.utility;

import org.springframework.stereotype.Component;

@Component
	public class ErrorStructure {

		private int status;
		private String message;
		private Object rootCause;
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public Object getRootCause() {
			return rootCause;
		}
		public void setRootCause(Object rootCause) {
			this.rootCause = rootCause;
		}

	}


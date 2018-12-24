package com.s3s.ssm.config;

public class ReportServiceUrlProvider {
	private static final String CATALOG_SERVICE_URL = "catalog_service_url";
	private static final String CORE_SERVICE_URL = "core_service_url";

	public static String getCatalogServiceUrl() {
		return System.getProperty(CATALOG_SERVICE_URL);
	}
	
	public static String getCoreServiceUrl() {
		return System.getProperty(CORE_SERVICE_URL);
	}
}

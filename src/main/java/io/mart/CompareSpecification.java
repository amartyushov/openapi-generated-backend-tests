package io.mart;

import java.io.FileWriter;
import java.io.IOException;

import org.openapitools.openapidiff.core.OpenApiCompare;
import org.openapitools.openapidiff.core.model.ChangedOpenApi;
import org.openapitools.openapidiff.core.output.HtmlRender;

// https://github.com/OpenAPITools/openapi-diff
public class CompareSpecification {
	
	public static final String OPENAPI_DOC1 = "openApiSpecification_v10.0.json";
	public static final String OPENAPI_DOC2 = "openApiSpecification_v11.0.json";
	
	public static void main(String[] args) {
		ChangedOpenApi diff = OpenApiCompare.fromLocations(OPENAPI_DOC1, OPENAPI_DOC2);
		
		String html = new HtmlRender("Changelog",
				"http://deepoove.com/swagger-diff/stylesheets/demo.css")
				.render(diff);
		
		try {
			FileWriter fw = new FileWriter("testNewApi.html");
			fw.write(html);
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

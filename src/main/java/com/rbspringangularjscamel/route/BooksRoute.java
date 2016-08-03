package com.rbspringangularjscamel.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class BooksRoute extends RouteBuilder {

	//private static final String GET_BOOKS = "restlet:books";
	private static final String GET_BOOKS_FROM_DB = "direct:data-from-db";
	private static final String MYBATIS_GETBOOKS = "mybatis:getBooks?statementType=SelectList";

	@Override
	public void configure() throws Exception {
		
		restConfiguration().component("restlet");
		
		rest("/books")
		.get().to(GET_BOOKS_FROM_DB);
		
		from(GET_BOOKS_FROM_DB)
		.from(MYBATIS_GETBOOKS)
		.to("log:me");

	}

}

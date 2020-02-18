package org.ais.product_ordering.order.clients;

import org.ais.product_ordering.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * TODO: This is autogenerated Java-Doc.
 *
 * @author Nikita_Puzankov
 */
@FeignClient(name = "catalog",
		url = "localhost:8081",
		configuration = FeignConfiguration.class)
public interface ProductSpecificationRepository
{

	@RequestMapping(method = RequestMethod.GET,
			path = "/catalog/{specificationId}")
	Object existsById(@PathVariable("specificationId") String specificationId);
}

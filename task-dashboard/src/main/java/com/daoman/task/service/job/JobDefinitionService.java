/**
 * 
 */
package com.daoman.task.service.job;

import java.util.List;

import com.daoman.task.domain.job.JobDefinition;


/**
 * @author mays
 *
 */
public interface JobDefinitionService {
	
	public List<JobDefinition> queryAll(Boolean isInUse);

//	public Pager<Product> pager(Pager<Product> pager, ProductCond cond);
//	
//	public ProductFull saveFull(ProductFull productFull);
//	
//	public Product update(Product product);
//	
//	public Integer remove(Integer id);
//	
//	public Product queryOne(Integer id, SessionUser user);
//	
//	public ProductFull queryOneFull(Integer id, Boolean readDefine, SessionUser user);
//	
//	public ProductFull updateFull(ProductFull productFull);
//	
//	public ProductFull initFull(SessionUser user, Product product, ProductDefine define);
}

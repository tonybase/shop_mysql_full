/*
 * Copyright 2008-2018 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 * FileId: 1CjsYQZyruidlxx7MaZ4MB9+Vjh9WQu1
 */
package net.shopxx.dao;

import java.util.List;
import java.util.Set;

import net.shopxx.entity.Product;
import net.shopxx.entity.Sku;
import net.shopxx.entity.Store;

/**
 * Dao - SKU
 * 
 * @author SHOP++ Team
 * @version 6.1
 */
public interface SkuDao extends BaseDao<Sku, Long> {

	/**
	 * 通过编号、名称查找SKU
	 * 
	 * @param store
	 *            店铺
	 * @param type
	 *            类型
	 * @param keyword
	 *            关键词
	 * @param excludes
	 *            排除SKU
	 * @param count
	 *            数量
	 * @return SKU
	 */
	List<Sku> search(Store store, Product.Type type, String keyword, Set<Sku> excludes, Integer count);

	/**
	 * 查找SKU
	 * 
	 * @param store
	 *            店铺
	 * @param type
	 *            类型
	 * @param matchs
	 *            匹配SKU
	 * @param count
	 *            数量
	 * @return SKU
	 */
	List<Sku> findList(Store store, Product.Type type, Set<Sku> matchs, Integer count);

}
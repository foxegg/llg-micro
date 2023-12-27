package indi.micro.common.log.filter;


import com.alibaba.fastjson2.filter.SimplePropertyPreFilter;

/**
 * @author: micro
 * @date: 2023/5/17 18:57
 * @description: 排除JSON敏感属性
 */

public class PropertyPreExcludeFilter extends SimplePropertyPreFilter {
	public PropertyPreExcludeFilter() {
	}

	public PropertyPreExcludeFilter addExcludes(String... filters) {
		for (String filter : filters) {
			this.getExcludes().add(filter);
		}
		return this;
	}
}

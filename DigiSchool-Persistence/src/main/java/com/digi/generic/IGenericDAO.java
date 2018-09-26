package com.digi.generic;

import java.io.Serializable;

public interface IGenericDAO<T extends Serializable,M extends Serializable> {
	
	void save(final T obj);

}

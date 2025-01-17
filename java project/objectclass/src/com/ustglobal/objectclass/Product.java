package com.ustglobal.objectclass;

public class Product {
int id;
String type;
Double cost;
String brand;
public Product(int id, String type, Double cost, String brand) {
	super();
	this.id = id;
	this.type = type;
	this.cost = cost;
	this.brand = brand;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((brand == null) ? 0 : brand.hashCode());
	result = prime * result + ((cost == null) ? 0 : cost.hashCode());
	result = prime * result + id;
	result = prime * result + ((type == null) ? 0 : type.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	if (brand == null) {
		if (other.brand != null)
			return false;
	} else if (!brand.equals(other.brand))
		return false;
	if (cost == null) {
		if (other.cost != null)
			return false;
	} else if (!cost.equals(other.cost))
		return false;
	if (id != other.id)
		return false;
	if (type == null) {
		if (other.type != null)
			return false;
	} else if (!type.equals(other.type))
		return false;
	return true;
}

}

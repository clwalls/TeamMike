import java.util.ArrayList;

public class PropertyList {
	private ArrayList<Property> properties;
	private static PropertyList propertyList;

	private PropertyList() {
		properties = dataLoader.loadProperties();
	}
	
	public static PropertyList getInstance() {
		if(propertyList == null) {
			propertyList = new PropertyList();
		}
		return propertyList;
	}
	
	public ArrayList<Property> getProperties() {
		return properties;
	}
	
	public void addProperty(ArrayList<String> amenities, String utilities, String location, int price, int beds, int baths, String description, String contact, boolean visible) {
		int id = properties.size() + 1;
		properties.add(new Property(id, amenities, utilities, location, price, beds, baths, description, contact, visible));
		//TODO add the property to json
	}

	public int getSize() {
		return properties.size();
	}

	public Property getProperty(int id) {
		return properties.get(id);
	}
	
	public String toString()
	{
		return "";
		//TODO
	}
}

/**
 * 
 */

/**
 * @author vishw
 *
 */
public class Patient {

	// Instance variables
	
	private double _patientID;
	private String _firstname;
	private String _lastname;
	private String _address;
	private String _city;
	private String _province;
	private String _postalcode;
	
	
	//Getter Methods
	
	public double get_patientID() {
		return _patientID;
	}
	public void set_patientID(double _patientID) {
		this._patientID = _patientID;
	}
	public String get_firstname() {
		return _firstname;
	}
	public void set_firstname(String _firstname) {
		this._firstname = _firstname;
	}
	public String get_lastname() {
		return _lastname;
	}
	public void set_lastname(String _lastname) {
		this._lastname = _lastname;
	}
	public String get_address() {
		return _address;
	}
	public void set_address(String _address) {
		this._address = _address;
	}
	public String get_city() {
		return _city;
	}
	public void set_city(String _city) {
		this._city = _city;
	}
	public String get_province() {
		return _province;
	}
	public void set_province(String _province) {
		this._province = _province;
	}
	public String get_postalcode() {
		return _postalcode;
	}
	public void set_postalcode(String _postalcode) {
		this._postalcode = _postalcode;
	}
	
	
	//Constructor
	
	public Patient(double _patientID, String _firstname,String _lastname, String _address, String _city, String _province, String _postalcode ) {
		
		this._patientID = _patientID;
		this._firstname = _firstname;
		this._lastname = _lastname;
		this._address = _address;
		this._city = _city;
		this._province = _province;
		this._postalcode = _postalcode;
	}
	
	public Patient() {}
		
	public void Retrieve() {
		System.out.println("PatientID: " + get_patientID() + 
				
				"\n First Name: " + get_firstname() + 
				"\n Last Name: " + get_lastname() + 
				"\n Address: " + get_address() +
				"\n City:  " + get_city() +
				"\n Province " + get_province() +
				"\n Postal Code: " + get_postalcode()
	
				);
	
}
		
	
		
		
	
	
	
	

	
}

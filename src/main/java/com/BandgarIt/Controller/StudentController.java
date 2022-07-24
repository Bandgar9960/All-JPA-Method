package com.BandgarIt.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BandgarIt.Model.Student;
import com.BandgarIt.Service.StudentServiceI;

@RestController
public class StudentController {

	@Autowired
	private StudentServiceI studentServiceI;

	@PostMapping("/saveAllStu")
	public List<Student> saveAllStu(@RequestBody List<Student> student) {

		List<Student> saveAllStudent = studentServiceI.saveAllStudent(student);

		return saveAllStudent;

	}

	@GetMapping("/getBySid/{sid}")
	public Student getBySid(@PathVariable Integer sid) {

		Student bySid = studentServiceI.findBySid(sid);
		return bySid;

	}

	@GetMapping("/getByName/{name}")
	public List<Student> getByName(@PathVariable String name) {
		List<Student> byName = studentServiceI.findByName(name);
		return byName;

	}

	@GetMapping("/getByAddress/{address}")
	public List<Student> getByAddress(@PathVariable String address) {

		List<Student> byAddress = studentServiceI.findByAddress(address);

		return byAddress;

	}

	@GetMapping("/getByEmail/{email}")
	public List<Student> getByEmail(@PathVariable String email) {
		List<Student> byEmail = studentServiceI.findByEmail(email);

		return byEmail;
	}

	@GetMapping("/getByAge/{age}")
	public List<Student> getByAge(@PathVariable int age) {

		List<Student> byAge = studentServiceI.findByAge(age);
		return byAge;

	}

	@GetMapping("/getByNameLike/{name}")
	public List<Student> getByNameLike(@PathVariable String name) {

		List<Student> byNameLike = studentServiceI.findByNameLike(name);

		return byNameLike;

	}

	@GetMapping("/countByNameLike/{name}")
	public int countByNameLike(@PathVariable String name) {

		int byNameLike = studentServiceI.countByNameLike(name);
		return byNameLike;

	}

	@GetMapping("/countByEmailLike/{email}")
	public int countByEmailLike(@PathVariable String email) {

		int byEmailLike = studentServiceI.countByEmailLike(email);
		return byEmailLike;
	}

	@GetMapping("/countByAddressLike/{address}")
	public int countByAddressLike(@PathVariable String address) {
		int byAddressLike = studentServiceI.countByAddressLike(address);
		return byAddressLike;
	}

	@GetMapping("/countByAgeLike/{age}")
	public int countByAgeLike(@PathVariable int age) {
		int byAgeLike = studentServiceI.countByAgeLike(age);
		return byAgeLike;

	}

	@GetMapping("/countByNameNotLike/{name}")
	public int countByNameNotLike(@PathVariable String name) {

		int byNameNotLike = studentServiceI.countByNameNotLike(name);
		return byNameNotLike;

	}

	@GetMapping("/countByEmailNotLike/{email}")
	public int countByEmaiNotlLike(@PathVariable String email) {

		int byEmailNotLike = studentServiceI.countByEmailNotLike(email);
		return byEmailNotLike;
	}

	@GetMapping("/countByAddressNotLike/{address}")
	public int countByAddressNotLike(@PathVariable String address) {
		int byAddressNotLike = studentServiceI.countByAddressNotLike(address);
		return byAddressNotLike;
	}

	@GetMapping("/countByAgeNotLike/{age}")
	public int countByAgeNotLike(@PathVariable int age) {
		int byAgeNotLike = studentServiceI.countByAgeNotLike(age);
		return byAgeNotLike;

	}

	@GetMapping("/NameStartingWith/{name}")
	public List<Student> findByNameStartingWith(@PathVariable String name) {

		List<Student> nameStartingWith = studentServiceI.findByNameStartingWith(name);
		return nameStartingWith;
	}

	@GetMapping("/AddressStartingWith/{address}")
	public List<Student> findByAddressStartingWith(@PathVariable String address) {

		List<Student> AddressStartingWith = studentServiceI.findByAddressStartingWith(address);
		return AddressStartingWith;
	}

	@GetMapping("/EmailStartingWith/{email}")
	public List<Student> findByEmailStartingWith(@PathVariable String email) {

		List<Student> EmailStartingWith = studentServiceI.findByEmailStartingWith(email);
		return EmailStartingWith;
	}

	@GetMapping("/NameOrAddress/{name}/{address}")
	public List<Student> findByNameOrAddress(@PathVariable String name, @PathVariable String address) {

		List<Student> nameOrAddress = studentServiceI.findByNameOrAddress(name, address);
		return nameOrAddress;

	}

	@GetMapping("/NameOrEmail/{name}/{email}")
	public List<Student> findByNameOrEmail(@PathVariable String name, @PathVariable String email) {
		List<Student> nameOrEmail = studentServiceI.findByNameOrEmail(name, email);

		return nameOrEmail;

	}

	@GetMapping("/NameOrAge/{name}/{age}")
	public List<Student> findByNameOrAge(@PathVariable String name, @PathVariable int age) {
		List<Student> nameOrAge = studentServiceI.findByNameOrAge(name, age);

		return nameOrAge;

	}

	@GetMapping("/AddressOrEmail/{address}/{email}")
	public List<Student> findByAddressOrEmail(@PathVariable String address, @PathVariable String email) {

		List<Student> addressOrEmail = studentServiceI.findByAddressOrEmail(address, email);
		return addressOrEmail;

	}

	@GetMapping("/AddressOrAge/{address}/{age}")
	public List<Student> findByAddressOrAge(@PathVariable String address, @PathVariable int age) {

		List<Student> addressOrAge = studentServiceI.findByAddressOrAge(address, age);
		return addressOrAge;

	}

	@GetMapping("/EmailOrAge/{email}/{age}")
	public List<Student> findByEmailOrAge(@PathVariable String email, @PathVariable int age) {
		List<Student> emailOrAge = studentServiceI.findByEmailOrAge(email, age);

		return emailOrAge;

	}

	@GetMapping("/NameAndAddress/{name}/{address}")
	public List<Student> findByNameAndAddress(@PathVariable String name, @PathVariable String address) {

		List<Student> nameAndAddress = studentServiceI.findByNameAndAddress(name, address);

		return nameAndAddress;

	}

	@GetMapping("/NameAndEmail/{name}/{email}")
	public List<Student> findByNameAndEmail(@PathVariable String name, @PathVariable String email) {

		List<Student> nameAndEmail = studentServiceI.findByNameAndEmail(name, email);

		return nameAndEmail;

	}

	@GetMapping("/NameAndAge/{name}/{age}")
	public List<Student> findByNameAndAge(@PathVariable String name, @PathVariable int age) {

		List<Student> nameAndAge = studentServiceI.findByNameAndAge(name, age);
		return nameAndAge;
	}

	@GetMapping("/AddressAndEmail/{address}/{email}")
	public List<Student> findByAddressAndEmail(@PathVariable String address, @PathVariable String email) {

		List<Student> addressAndEmail = studentServiceI.findByAddressAndEmail(address, email);
		return addressAndEmail;

	}

	@GetMapping("/AddressAndAge/{address}/{age}")
	public List<Student> findByAddressAndAge(@PathVariable String address, @PathVariable int age) {

		List<Student> addressAndAge = studentServiceI.findByAddressAndAge(address, age);

		return addressAndAge;

	}

	@GetMapping("/EmailAndAge/{email}/{age}")
	public List<Student> findByEmailAndAge(@PathVariable String email, @PathVariable int age) {

		List<Student> emailAndAge = studentServiceI.findByEmailAndAge(email, age);

		return emailAndAge;

	}

	@GetMapping("/AgeLessThan/{age}")
	public List<Student> findByAgeLessThan(@PathVariable int age) {

		List<Student> ageLessThan = studentServiceI.findByAgeLessThan(age);

		return ageLessThan;

	}

	@GetMapping("/AgeLessThanEqual/{age}")
	public List<Student> findByAgeLessThanEqual(@PathVariable int age) {
		List<Student> ageLessThanEqual = studentServiceI.findByAgeLessThanEqual(age);

		return ageLessThanEqual;

	}

	@GetMapping("/AgeGreaterThan/{age}")
	public List<Student> findByAgeGreaterThan(@PathVariable int age) {

		List<Student> ageGreaterThan = studentServiceI.findByAgeGreaterThan(age);

		return ageGreaterThan;

	}

	@GetMapping("/AgeGreaterThanEqual/{age}")
	public List<Student> findByAgeGreaterThanEqual(@PathVariable int age) {

		List<Student> ageGreaterThanEqual = studentServiceI.findByAgeGreaterThanEqual(age);

		return ageGreaterThanEqual;

	}

	@GetMapping("/findBySidIs/{sid}")
	public Student findBySidIs(@PathVariable int sid) {

		Student findBySidIs = studentServiceI.findBySidIs(sid);

		return findBySidIs;

	}

	@GetMapping("/findByNameIs/{name}")
	public List<Student> findByNameIs(@PathVariable String name) {

		List<Student> byNameIs = studentServiceI.findByNameIs(name);

		return byNameIs;

	}

	@GetMapping("/findByEmailIs/{email}")
	public List<Student> findByEmailIs(@PathVariable String email) {

		List<Student> byEmailIs = studentServiceI.findByEmailIs(email);

		return byEmailIs;

	}

	@GetMapping("/findByAddressIs/{address}")
	public List<Student> findByAddressIs(@PathVariable String address) {

		List<Student> byAddressIs = studentServiceI.findByAddressIs(address);

		return byAddressIs;

	}

	@GetMapping("/findByAgeIs/{age}")
	public List<Student> findByAgeIs(@PathVariable int age) {

		List<Student> byAgeIs = studentServiceI.findByAgeIs(age);

		return byAgeIs;

	}

	@GetMapping("/findBySidEquals/{sid}")
	public Student findBySidEquals(@PathVariable  int sid) {

		Student bySidEquals = studentServiceI.findBySidEquals(sid);

		return bySidEquals;

	}

	@GetMapping("/findByNameEquals/{name}")
	public List<Student> findByNameEquals(@PathVariable String name) {

		List<Student> byNameEquals = studentServiceI.findByNameEquals(name);

		return byNameEquals;

	}

	@GetMapping("/findByEmailEquals/{email}")
	public List<Student> findByEmailEquals(@PathVariable  String email) {

		List<Student> byEmailEquals = studentServiceI.findByEmailEquals(email);

		return byEmailEquals;

	}

	@GetMapping("/findByAddressEquals/{address}")
	public List<Student> findByAddressEquals(@PathVariable  String address) {

		List<Student> byAddressEquals = studentServiceI.findByAddressEquals(address);

		return byAddressEquals;

	}

	@GetMapping("/findByAgeEquals/{age}")
	public List<Student> findByAgeEquals(@PathVariable int age) {

		List<Student> byAgeEquals = studentServiceI.findByAgeEquals(age);

		return byAgeEquals;

	}

}

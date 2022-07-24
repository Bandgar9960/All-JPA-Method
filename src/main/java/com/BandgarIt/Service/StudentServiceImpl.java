package com.BandgarIt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BandgarIt.Model.Student;
import com.BandgarIt.Repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentServiceI {

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public List<Student> saveAllStudent(List<Student> student) {

		List<Student> saveAll = studentRepo.saveAll(student);

		return saveAll;

	}

	@Override
	public Student findBySid(int sid) {
		Student bySid = studentRepo.findBySid(sid);
		return bySid;
	}

	@Override
	public List<Student> findByName(String name) {
		List<Student> ByName = studentRepo.findByName(name);
		return ByName;
	}

	@Override
	public List<Student> findByAddress(String address) {

		List<Student> byAddress = studentRepo.findByAddress(address);
		return byAddress;
	}

	@Override
	public List<Student> findByEmail(String email) {

		List<Student> byEmail = studentRepo.findByEmail(email);

		return byEmail;
	}

	@Override
	public List<Student> findByAge(int age) {

		List<Student> byAge = studentRepo.findByAge(age);

		return byAge;
	}

	@Override
	public List<Student> findByNameLike(String name) {

		List<Student> byNameLike = studentRepo.findByNameLike("%" + name + "%");
		return byNameLike;
	}

	@Override
	public int countByNameLike(String name) {

		int byNameLike = studentRepo.countByNameLike(name);

		return byNameLike;
	}

	@Override
	public int countByEmailLike(String email) {

		int byEmailLike = studentRepo.countByEmailLike(email);

		return byEmailLike;
	}

	@Override
	public int countByAddressLike(String address) {

		int byAddressLike = studentRepo.countByAddressLike(address);

		return byAddressLike;
	}

	@Override
	public int countByAgeLike(int age) {

		int byAgeLike = studentRepo.countByAgeLike(age);
		return byAgeLike;
	}

	@Override
	public int countByNameNotLike(String name) {

		int byNameNotLike = studentRepo.countByNameNotLike(name);

		return byNameNotLike;
	}

	@Override
	public int countByEmailNotLike(String email) {

		int byEmailNotLike = studentRepo.countByEmailNotLike(email);
		return byEmailNotLike;
	}

	@Override
	public int countByAddressNotLike(String address) {

		int byAddressNotLike = studentRepo.countByAddressNotLike(address);

		return byAddressNotLike;
	}

	@Override
	public int countByAgeNotLike(int age) {
		int byAgeNotLike = studentRepo.countByAgeNotLike(age);

		return byAgeNotLike;
	}

	@Override
	public List<Student> findByNameStartingWith(String name) {
		List<Student> nameStartingWith = studentRepo.findByNameStartingWith(name);

		return nameStartingWith;
	}

	@Override
	public List<Student> findByEmailStartingWith(String email) {
		List<Student> emailStartingWith = studentRepo.findByEmailStartingWith(email);
		return emailStartingWith;
	}

	@Override
	public List<Student> findByAddressStartingWith(String address) {
		List<Student> addressStartingWith = studentRepo.findByAddressStartingWith(address);
		return addressStartingWith;
	}

	@Override
	public List<Student> findByNameOrAddress(String name, String address) {

		List<Student> nameOrAddress = studentRepo.findByNameOrAddress(name, address);

		return nameOrAddress;
	}

	@Override
	public List<Student> findByNameOrEmail(String name, String email) {

		List<Student> nameOrEmail = studentRepo.findByNameOrEmail(name, email);
		return nameOrEmail;
	}

	@Override
	public List<Student> findByNameOrAge(String name, int age) {

		List<Student> nameOrAge = studentRepo.findByNameOrAge(name, age);
		return nameOrAge;
	}

	@Override
	public List<Student> findByAddressOrEmail(String address, String email) {

		List<Student> addressOrEmail = studentRepo.findByAddressOrEmail(address, email);
		return addressOrEmail;
	}

	@Override
	public List<Student> findByAddressOrAge(String address, int age) {

		List<Student> addressOrAge = studentRepo.findByAddressOrAge(address, age);
		return addressOrAge;
	}

	@Override
	public List<Student> findByEmailOrAge(String email, int age) {
		List<Student> emailOrAge = studentRepo.findByEmailOrAge(email, age);
		return emailOrAge;
	}

	@Override
	public List<Student> findByNameAndAddress(String name, String address) {

		List<Student> nameAndAddress = studentRepo.findByNameAndAddress(name, address);

		return nameAndAddress;
	}

	@Override
	public List<Student> findByNameAndEmail(String name, String email) {

		List<Student> nameAndEmail = studentRepo.findByNameAndEmail(name, email);

		return nameAndEmail;
	}

	@Override
	public List<Student> findByNameAndAge(String name, int age) {

		List<Student> nameAndAge = studentRepo.findByNameAndAge(name, age);

		return nameAndAge;
	}

	@Override
	public List<Student> findByAddressAndEmail(String address, String email) {

		List<Student> addressAndEmail = studentRepo.findByAddressAndEmail(address, email);

		return addressAndEmail;
	}

	@Override
	public List<Student> findByAddressAndAge(String address, int age) {

		List<Student> addressAndAge = studentRepo.findByAddressAndAge(address, age);

		return addressAndAge;
	}

	@Override
	public List<Student> findByEmailAndAge(String email, int age) {

		List<Student> emailAndAge = studentRepo.findByEmailAndAge(email, age);

		return emailAndAge;
	}

	@Override
	public List<Student> findByAgeLessThan(int age) {

		List<Student> ageLessThan = studentRepo.findByAgeLessThan(age);

		return ageLessThan;
	}

	@Override
	public List<Student> findByAgeLessThanEqual(int age) {

		List<Student> ageLessThanEqual = studentRepo.findByAgeLessThanEqual(age);

		return ageLessThanEqual;
	}

	@Override
	public List<Student> findByAgeGreaterThan(int age) {

		List<Student> ageGreaterThan = studentRepo.findByAgeGreaterThan(age);

		return ageGreaterThan;
	}

	@Override
	public List<Student> findByAgeGreaterThanEqual(int age) {

		List<Student> AgeGreaterThanEqual = studentRepo.findByAgeGreaterThanEqual(age);

		return AgeGreaterThanEqual;
	}

	@Override
	public Student findBySidIs(int sid) {

		Student findBySidIs = studentRepo.findBySidIs(sid);

		return findBySidIs;
	}

	@Override
	public List<Student> findByNameIs(String name) {

		List<Student> byNameIs = studentRepo.findByNameIs(name);

		return byNameIs;
	}

	@Override
	public List<Student> findByEmailIs(String email) {

		List<Student> byEmailIs = studentRepo.findByEmailIs(email);

		return byEmailIs;
	}

	@Override
	public List<Student> findByAddressIs(String address) {

		List<Student> byAddressIs = studentRepo.findByAddressIs(address);

		return byAddressIs;
	}

	@Override
	public List<Student> findByAgeIs(int age) {

		List<Student> byAgeIs = studentRepo.findByAgeIs(age);

		return byAgeIs;
	}

	@Override
	public Student findBySidEquals(int sid) {

		Student bySidEquals = studentRepo.findBySidEquals(sid);
		return bySidEquals;
	}

	@Override
	public List<Student> findByNameEquals(String name) {

		List<Student> byNameEquals = studentRepo.findByNameEquals(name);

		return byNameEquals;
	}

	@Override
	public List<Student> findByEmailEquals(String email) {

		List<Student> byEmailEquals = studentRepo.findByEmailEquals(email);

		return byEmailEquals;
	}

	@Override
	public List<Student> findByAddressEquals(String address) {

		List<Student> byAddressEquals = studentRepo.findByAddressEquals(address);

		return byAddressEquals;
	}

	@Override
	public List<Student> findByAgeEquals(int age) {

		List<Student> byAgeEquals = studentRepo.findByAgeEquals(age);

		return byAgeEquals;
	}

}

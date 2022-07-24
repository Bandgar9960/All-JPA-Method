package com.BandgarIt.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.BandgarIt.Model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	// 5 findByMethod

	Student findBySid(int sid);

	List<Student> findByName(String name);

	List<Student> findByAddress(String address);

	List<Student> findByEmail(String email);

	List<Student> findByAge(int age);

	// 5 Like Method

	@Query("select s from Student s where s.name like:key")
	List<Student> findByNameLike(@Param("key") String name);

	// 4 countByNameLike method
	public int countByNameLike(String name);

	public int countByEmailLike(String email);

	public int countByAddressLike(String address);

	public int countByAgeLike(int age);

	// 4 countBynameNotLike method
	public int countByNameNotLike(String name);

	public int countByEmailNotLike(String email);

	public int countByAddressNotLike(String address);

	public int countByAgeNotLike(int age);

	// 3 StartingWith method
	public List<Student> findByNameStartingWith(String name);

	public List<Student> findByEmailStartingWith(String email);

	public List<Student> findByAddressStartingWith(String address);

	// 6 OR operator methods
	public List<Student> findByNameOrAddress(String name, String address);

	public List<Student> findByNameOrEmail(String name, String email);

	public List<Student> findByNameOrAge(String name, int age);

	public List<Student> findByAddressOrEmail(String address, String email);

	public List<Student> findByAddressOrAge(String address, int age);

	public List<Student> findByEmailOrAge(String email, int age);

	// 6 And operator methods
	public List<Student> findByNameAndAddress(String name, String address);

	public List<Student> findByNameAndEmail(String name, String email);

	public List<Student> findByNameAndAge(String name, int age);

	public List<Student> findByAddressAndEmail(String address, String email);

	public List<Student> findByAddressAndAge(String address, int age);

	public List<Student> findByEmailAndAge(String email, int age);

	// 4 Compare methods
	public List<Student> findByAgeLessThan(int age);

	public List<Student> findByAgeLessThanEqual(int age);

	public List<Student> findByAgeGreaterThan(int age);

	public List<Student> findByAgeGreaterThanEqual(int age);

	// 5 Is Operator
	public Student findBySidIs(int sid);

	public List<Student> findByNameIs(String name);

	public List<Student> findByEmailIs(String email);

	public List<Student> findByAddressIs(String address);

	public List<Student> findByAgeIs(int age);

	// 5 Equals Operator
	public Student findBySidEquals(int sid);

	public List<Student> findByNameEquals(String name);

	public List<Student> findByEmailEquals(String email);

	public List<Student> findByAddressEquals(String address);

	public List<Student> findByAgeEquals(int age);

}

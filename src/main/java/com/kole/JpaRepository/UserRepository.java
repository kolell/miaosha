package com.kole.JpaRepository;

import com.kole.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsernameAndPassword(String username, String password);

    /**
    //And --- 等价于 SQL 中的 and 关键字；
    List<User> findByPNameAndPAge(String PName, Integer PAge);

    // Or --- 等价于 SQL 中的 or 关键字；
    List<User> findByPNameOrPAge(String PName, Integer PAge);

    //Between --- 等价于 SQL 中的 between 关键字；
    List<User> findByPAgeBetween(Integer min, Integer max);

    //LessThan --- 等价于 SQL 中的 "<"；  日期类型也可以使用Before关键字
    List<User> findByPAgeLessThan(Integer max);

    //LessThanEqual --- 等价于 SQL 中的 "<="；
    List<User> findByPAgeLessThanEqual(Integer max);

    //GreaterThan --- 等价于 SQL 中的">"；日期类型也可以使用After关键字
    List<User> findByPAgeGreaterThan(Integer min);

    //GreaterThanEqual --- 等价于 SQL 中的">="；
    List<User> findByPAgeGreaterThanEqual(Integer min);

    //IsNull --- 等价于 SQL 中的 "is null"；
    List<User> findByPNameIsNull();

    //IsNotNull --- 等价于 SQL 中的 "is not null"；
    List<User> findByPNameIsNotNull();

    //NotNull --- 与 IsNotNull 等价；
    List<User> findByPNameNotNull();

    //Like --- 等价于 SQL 中的 "like";
    List<User> findByPNameLike(String PName);

    //NotLike --- 等价于 SQL 中的 "not like"；
    List<User> findByPNameNotLike(String PName);

    //OrderBy --- 等价于 SQL 中的 "order by"；
    List<User> findByPNameNotNullOrderByPAgeAsc();

    //Not --- 等价于 SQL 中的 "！ ="；
    List<User> findByPNameNot(String PName);

    //In --- 等价于 SQL 中的 "in";
    List<User> findByPNameIn(String PName);

    //NotIn --- 等价于 SQL 中的 "not in";
    List<User> findByPNameNotIn(String PName);


    //Top --- 查询符合条件的前两条记录，等价与First关键字
    List<User> findTop2ByPName(String PName);

    //2.以下方法基于@Query注解，方法名称可以随意，可用于查询和更新方法，更新方法要设置@Modifying注解
    //使用命名参数
    @Query("select p from User p where p.pName = :name and p.pAge = :age")
    List<User> withNameAndAgeQuery(@Param("name") String name, @Param("age") Integer age);

    //使用参数索引
    @Query("select p from User p where p.pName = ?1 and p.pAge = ?2")
    List<User> withNameAndAgeQuery2(String name, Integer age);


    //删除操作，使用hql，如果要使用sql，需要增加nativeQuery = true
    @Query(value = "delete from User where pId=?1")
    @Modifying
    int deleteUserById(Integer id);

    //修改操作
    @Query(value = "update User set pName=?1 where pId=?2 ")
    @Modifying
    int updateUserName(String name, Integer id);

    //插入操作，使用sql操作
    @Query(value = "insert into User(p_name,p_age) value(?1,?2)",nativeQuery = true)
    @Modifying
    int insertUserByParam(String name, Integer age);


    //3.以下方法实现分页查询功能，只需要在方法中增加Pageable pageable参数即可，返回结果为Page集合
    Page<User> findByPNameNot(String name, Pageable pageable);

    //使用命名参数
    @Query("select p from User p where p.pName = :name ")
    Page<User> withNameQueryPage(@Param("name") String name, Pageable pageable);

    */
}

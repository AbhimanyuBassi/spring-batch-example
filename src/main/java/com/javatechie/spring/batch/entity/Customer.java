package com.javatechie.spring.batch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMERS_INFO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "CASE")
    private String case;
    @Column(name = "REGION")
    private String region;
    @Column(name = "ROW")
    private String row;
    @Column(name = "QUANTITY")
    private String quantity;
    @Column(name = "UNITS")
    private String units;
    @Column(name = "YEAR2008")
    private String year2008;
    @Column(name = "YEAR2009")
    private String year2009;
    @Column(name = "YEAR2010")
    private String year2010;
    @Column(name = "YEAR2011")
    private String year2011;
    @Column(name = "YEAR2012")
    private String year2012;
    @Column(name = "YEAR2013")
    private String year2013;
    @Column(name = "YEAR2014")
    private String year2014;
    @Column(name = "YEAR2015")
    private String year2015;
    @Column(name = "YEAR2016")
    private String year2016;
    @Column(name = "YEAR2017")
    private String year2017;
    @Column(name = "YEAR2018")
    private String year2018;
    @Column(name = "YEAR2019")
    private String year2019;
    @Column(name = "YEAR2020")
    private String year2020;
    @Column(name = "YEAR2021")
    private String year2021;
    @Column(name = "YEAR2022")
    private String year2022;
    @Column(name = "YEAR2023")
    private String year2023;
    @Column(name = "YEAR2024")
    private String year2024;
    @Column(name = "YEAR2025")
    private String year2025;
    @Column(name = "YEAR2026")
    private String year2026;
    @Column(name = "YEAR2027")
    private String year2027;
    @Column(name = "YEAR2028")
    private String year2028;
    @Column(name = "YEAR2029")
    private String year2029;
    @Column(name = "YEAR2030")
    private String year2030;
    @Column(name = "YEAR2031")
    private String year2031;
    @Column(name = "YEAR2032")
    private String year2032;
    @Column(name = "YEAR2033")
    private String year2033;
    @Column(name = "YEAR2034")
    private String year2034;
    @Column(name = "YEAR2035")
    private String year2035;
    @Column(name = "YEAR2036")
    private String year2036;
    @Column(name = "YEAR2037")
    private String year2037;
    @Column(name = "YEAR2038")
    private String year2038;
    @Column(name = "YEAR2039")
    private String year2039;
    @Column(name = "YEAR2040")
    private String year2040;
    @Column(name = "YEAR2041")
    private String year2041;
    @Column(name = "YEAR2042")
    private String year2042;
    @Column(name = "YEAR2043")
    private String year2043;
    @Column(name = "YEAR2044")
    private String year2044;
    @Column(name = "YEAR2045")
    private String year2045;
    @Column(name = "YEAR2046")
    private String year2046;
    @Column(name = "YEAR2047")
    private String year2047;
    @Column(name = "YEAR2048")
    private String year2048;
    @Column(name = "YEAR2049")
    private String year2049;
    @Column(name = "YEAR2050")
    private String year2050;
    @Column(name = "YEAR2051")
    private String year2051;
    @Column(name = "YEAR2052")
    private String year2052;
    @Column(name = "YEAR2053")
    private String year2053;
    @Column(name = "YEAR2054")
    private String year2054;
    @Column(name = "YEAR2055")
    private String year2055;
    @Column(name = "YEAR2056")
    private String year2056;
    @Column(name = "YEAR2057")
    private String year2057;
    @Column(name = "YEAR2058")
    private String year2058;
    @Column(name = "YEAR2059")
    private String year2059;
    @Column(name = "YEAR2060")
    private String year2060;
    @Column(name = "YEAR2061")
    private String year2061;
    @Column(name = "YEAR2062")
    private String year2062;
    @Column(name = "YEAR2063")
    private String year2063;
    @Column(name = "YEAR2064")
    private String year2064;
    @Column(name = "YEAR2065")
    private String year2065;
    @Column(name = "YEAR2066")
    private String year2066;
    @Column(name = "YEAR2067")
    private String year2067;
    @Column(name = "YEAR2068")
    private String year2068;
    @Column(name = "YEAR2069")
    private String year2069;
    @Column(name = "YEAR2070")
    private String year2070;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
}

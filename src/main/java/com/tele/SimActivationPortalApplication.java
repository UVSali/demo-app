package com.tele;

import java.time.LocalDate;

import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tele.dto.CustomerAddressDTO;
import com.tele.dto.CustomerDTO;
import com.tele.dto.CustomerIdentityDTO;
import com.tele.dto.SimDetailsDTO;
import com.tele.dto.SimOffersDTO;
import com.tele.entity.CustomerIdentity;
import com.tele.entity.SimDetails;
import com.tele.entity.CustomerAddress;
import com.tele.service.CustomerAddressServiceImpl;
import com.tele.service.CustomerIdentityImpl;
import com.tele.service.CustomerService;
import com.tele.service.CustomerServiceImpl;
import com.tele.service.SimDetailsImpl;
import com.tele.service.SimOffersServiceImpl;

@SpringBootApplication
public class SimActivationPortalApplication implements CommandLineRunner{
	
	@Autowired
	ApplicationContext context;
	
	@Autowired
	 CustomerServiceImpl service;
	
	@Autowired
	 SimDetailsImpl Simservice;
	
	@Autowired
	CustomerIdentityImpl custIdentity;
	
	@Autowired
	SimOffersServiceImpl simOfferimpl;
	
	@Autowired
	CustomerAddressServiceImpl customerAddressService;

	public static void main(String[] args) {
		SpringApplication.run(SimActivationPortalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		CustomerAddressDTO ca = new CustomerAddressDTO(1,	"Jayanagar"	,"Bangalore",	560041,"Karnataka");
		SimDetailsDTO sd  = new SimDetailsDTO(1,	1234567891L,	1234567891234L,"active");
		
		
		CustomerDTO c = new CustomerDTO(567891234567L,	LocalDate.of(1990, 12, 12),	"smith@abc.com"	,"Smith",	"John"	,"Aadhar",	ca,	sd,	"Karnataka");
		
		CustomerAddressDTO ca1 = new CustomerAddressDTO(2,	"Vijaynagar"	,"Mysore",	567017,"Karnataka");
		SimDetailsDTO sd1  = new SimDetailsDTO(2	,1234567892L	,1234567891235L	,"inactive");
		
//		
		CustomerDTO c1 = new CustomerDTO(567891234568L,	LocalDate.of(1998,12,12),"bob@abc.com",	"Bob",	"Sam"	,"Aadhar",	ca1	,sd1	,"Karnataka");
//		
		SimOffersDTO so = new SimOffersDTO(1,	100,	100,	120,	10,	"Free calls and data",sd);
		SimOffersDTO so1 = new SimOffersDTO(2	,150	,50	,100	,15,	"Free calls"	,sd1);

		
		
		CustomerIdentityDTO cid = new CustomerIdentityDTO(567891234567L,	LocalDate.of(1990,12,12),	"Smith"	,"John"	,"smith@abc.com","Karnataka");
		CustomerIdentityDTO cid1 = new CustomerIdentityDTO(567891234568L	,LocalDate.of(1998, 12, 12),"Bob","	Sam","	bob@abc.com","	Karnataka");

		service.addCustomer(c);
		service.addCustomer(c1);
		
		custIdentity.addCustomerIdentity(cid);
		custIdentity.addCustomerIdentity(cid1);
		
		simOfferimpl.addSimOffers(so1);
		simOfferimpl.addSimOffers(so);
		

		
		
//		
//	
////	CustomerDTO cs = new CustomerDTO();
////	cs.setUniqueIdNumber(12345678912345L);
////	cs.setDOB(LocalDate.of(1990, 12, 12));
////	cs.setEmailAddress("smith@abc.com");
////	cs.setFirstName("Smith");
////	cs.setLastName("John");
////	cs.setIdType("Aadhaar");
////	cs.setState("Karnataka");
////	//cs.setSimId(1);
////	
////	CustomerAddress ca = new CustomerAddress();
////	ca.setAddressId(1);
////	ca.setState("Karnataka");
//////	ca.setAddress("Jayanagar");
//////	ca.setCity("Banglore");
//////	ca.setPincode(560041);
////	cs.setCustomerAddress(ca);
//	
//	SimDetailsDTO sm = new SimDetailsDTO();
//	sm.setServiceNumber(1234567891L);
//	sm.setSimId(1);
//	sm.setSimNumber(1234567891L);
//	sm.setSimStatus("InActive");
//	
//	SimDetailsDTO sm1 = new SimDetailsDTO();
//	sm1.setServiceNumber(1234567892L);
//	sm1.setSimId(2);
//	sm1.setSimNumber(1234567891235L);
//	sm1.setSimStatus("InActive");
//	
//	
//	CustomerIdentityDTO cid = new CustomerIdentityDTO();
//	cid.setDOB(LocalDate.of(1990,12,12));
//	cid.setUniqueIdNumber(123456789123L);
//	cid.setState("Karnataka");
//	cid.setFirstName("Smith");
//	cid.setLastName("John");
//	cid.setEmailAddress("smith@abc.com");
//	
//	
//
//	//CustomerIdentityDTO cid = new CustomerIdentityDTO(123456789123L, LocalDate.of(1990,12,12),"Smith","John", "smith@abc.com", "Karnataka");
//	CustomerIdentityDTO cid1 = new CustomerIdentityDTO(12345847354L, LocalDate.of(1998, 12, 12),"Bob","Sam", "Bob@abc", "Karnataka");
//
//	SimOffersDTO sod = new SimOffersDTO();
//	sod.setCallQty(100);
//	sod.setCost(100);
//	sod.setDuration(10);
//	sod.setOfferId(1);
//	sod.setOfferName("Free calls and data");
//	
//	SimDetailsDTO sds = new SimDetailsDTO(1,	1234567891L	,123456891234L,	"active");
//	
//	sod.setSimdetals(sds);
//
//	
//	simOfferimpl.addSimOffers(sod);
//	Simservice.addSimDetails(sm);
//	Simservice.addSimDetails(sm1);
//	service.addCustomer(cs);
//	custIdentity.addCustomerIdentity(cid);
//	custIdentity.addCustomerIdentity(cid1);
//	
//	
		
		System.out.println("inserted");
	}

}

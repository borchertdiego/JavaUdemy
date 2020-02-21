package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;

/*  O Worker t�m apenas um departamento e v�rios contratos  */
	private Department department;
	private List<HourContract> contracts = new ArrayList<>(); /*  N�o � inclu�do no construtor  */
	
	public Worker() {
	}
	
/*	O construtor vai apontar para um objeto do department que foi instanciado na main	*/	
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	
/*  Adiciona um novo contrato no final da lista usando a fun��o add do ArrayList  */	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
/*  Remove um contrato com o ind�ce encontrado  */	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

/*  Retorna o valor que o funcion�rio recebeu em determinado per�odo  */
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar calendar = Calendar.getInstance();
		
	/*  Para cada contrato da lista � verificado se o ano e m�s � igual ao informado e � feito a soma  */
		for (HourContract contract: contracts) {
			calendar.setTime(contract.getDate());
			
			int contractYear = calendar.get(Calendar.YEAR);
			int contractMonth = 1 + calendar.get(Calendar.MONTH);
			
			if (contractYear == year && contractMonth == month) {
				sum += contract.totalValue();
			}
		}
		return sum;
	}
}
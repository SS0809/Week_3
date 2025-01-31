package com.heapsort;

class JobApplicant {
    private String name;
    private double salary;

    public JobApplicant(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return (name+ ": Rs. "+salary);
    }
}

public class HeapSort {
    private static void heapify(JobApplicant[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left].getSalary() > arr[largest].getSalary()) {
            largest = left;
        }
        if (right < n && arr[right].getSalary() > arr[largest].getSalary()) {
            largest = right;
        }
        if (largest != i) {
            JobApplicant temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    public static void sort(JobApplicant[] applicants) {
        int n = applicants.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(applicants, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            JobApplicant temp = applicants[0];
            applicants[0] = applicants[i];
            applicants[i] = temp;
            heapify(applicants, i, 0);
        }
    }

    public static void main(String[] args) {
        JobApplicant[] applicants = {
                new JobApplicant("Nishant", 75000.0),
                new JobApplicant("Saurabh", 65000.0),
                new JobApplicant("Uday", 85000.0),
                new JobApplicant("Shreya", 55000.0),
                new JobApplicant("Pankaj", 95000.0)
        };

        System.out.println("Original applicant list:");
        for (JobApplicant applicant : applicants) {
            System.out.println(applicant);
        }
        sort(applicants);
        System.out.println("\nSorted applicant list (by salary):");
        for (JobApplicant applicant : applicants) {
            System.out.println(applicant);
        }
    }
}
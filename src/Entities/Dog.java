package Entities;

import Enums.DogSize;

import java.util.ArrayList;
import java.util.List;

public class Dog {
    public int id;
    public String name;
    public String breed;
    public int ageMonths;
    public DogSize size;
    public boolean isVaccine;
    public boolean isSterilized;
    public boolean isAdopted;
    public String adoptiveParent;

    public Dog() {}

    public Dog(int id, String name, String breed, int ageMonths, DogSize size, boolean isVaccine, boolean isSterilized, boolean isAdopted, String adoptiveParent) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.ageMonths = ageMonths;
        this.size = size;
        this.isVaccine = isVaccine;
        this.isSterilized = isSterilized;
        this.isAdopted = isAdopted;
        this.adoptiveParent = adoptiveParent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAgeMonths() {
        return ageMonths;
    }

    public void setAgeMonths(int ageMonths) {
        this.ageMonths = ageMonths;
    }

    public DogSize getSize() {
        return size;
    }

    public void setSize(DogSize size) {
        this.size = size;
    }

    public boolean isVaccine() {
        return isVaccine;
    }

    public void setVaccine(boolean vaccine) {
        isVaccine = vaccine;
    }

    public boolean isSterilized() {
        return isSterilized;
    }

    public void setSterilized(boolean sterilized) {
        isSterilized = sterilized;
    }

    public boolean isAdopted() {
        return isAdopted;
    }

    public void setAdopted(boolean adopted) {
        isAdopted = adopted;
    }

    public String getAdoptiveParent() {
        return adoptiveParent;
    }

    public void setAdoptiveParent(String adoptiveParent) {
        this.adoptiveParent = adoptiveParent;
    }

    public void toVaccinate() {
        this.isVaccine = true;
    }

    public void toSterilized() {
        this.isSterilized = true;
    }

    public void toAdopted(String adoptedParent) {
        this.isAdopted = true;
        this.adoptiveParent = adoptedParent;
    }

    public int calculateHumanAge() {
        return (this.ageMonths / 12) * 7;
    }

    public boolean suitableForApartment() {
        boolean suitable = false;
        if (this.isVaccine ) {
            if (this.size == DogSize.SMALL || this.size == DogSize.MEDIUM) {
                suitable = true;
            }
        }
        return suitable;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", ageMonths=" + ageMonths +
                ", size=" + size +
                ", isVaccine=" + isVaccine +
                ", isSterilized=" + isSterilized +
                ", isAdopted=" + isAdopted +
                ", adoptiveParent='" + adoptiveParent + '\'' +
                '}';
    }
}

package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {

    @Test
    public void collect() {
        Profiles pr = new Profiles();
        Profile profile1 = new Profile(new Address("Москва", "Молодежная", 1, 2));
        Profile profile2 = new Profile(new Address("Владимир", "Бакерева", 3, 4));
        List<Profile> profiles = List.of(profile1, profile2);
        List<Address> rsl = pr.collect(profiles);
        List<Address> expected = List.of(
                profile1.getAddress(),
                profile2.getAddress()
        );
        assertThat(rsl, is(expected));
    }
}
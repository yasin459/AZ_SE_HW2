package com.jetbrains.marco;


import net.javacrumbs.jsonunit.assertj.JsonAssertions;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.xmlunit.assertj.XmlAssert;


import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


class RectangleTest {

    Rectangle rect = new Rectangle(10, 12);
    
    @Test
    void test_rectangle(){
        assertEquals(13,12);
    }
    // //@Mock
    // User user;

    // @Test
    // @DisplayName("User should be at least 18")
    // void user_should_be_at_least_18() {
    //   assertThat(user.age()).isGreaterThanOrEqualTo(18);

    // /*  assertThat(user.blocked())
    //           .as("User %s should be blocked", user.name())
    //           .isTrue();*/
    //     assertThatJson(user).isEqualTo("{\"name\":\"Marco\",\"age\":37,\"blocked\":false,\"birthDate\":[1985, 5, 4]}");

    //     XmlAssert.assertThat( "<a><b attr=\"abc\"></b></a>").nodesByXPath("//a/b/@attr").exist();


    // }

}

package controller;

import com.emiryucel.courseportal.controller.LecturerController;
import com.emiryucel.courseportal.dto.LecturerDto;
import com.emiryucel.courseportal.service.LecturerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;


@ExtendWith(MockitoExtension.class)
public class LecturerControllerTest {

    @Mock
    private LecturerService service;

    @InjectMocks
    private LecturerController controller;

    @Test
    void getLecturer_WithValidId_ShouldReturnLecturerDto() throws Exception {


        Long lecturerSystemId = 1L;
        LecturerDto expected=new LecturerDto();
        expected.setId(lecturerSystemId);

        Mockito.when(service.getLecturerWithId(Mockito.any(Long.class))).thenReturn(expected);

      //  LecturerDto actual= controller.getLecturer(lecturerSystemId).getBody();

       // Assertions.assertEquals(expected,actual);



    }
}

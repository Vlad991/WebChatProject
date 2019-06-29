package com.infopulse.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class ReceiveMessage {    //сообщение C to S
    @NotNull(message = "type is required")    //не на техническом языке
    private String type;
    private String receiver;     //получатель (отправитель и так известен)
    private String message;
//    private List<String> logins;
}

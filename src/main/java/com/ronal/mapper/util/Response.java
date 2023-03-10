package com.ronal.mapper.util;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Response <T> {
    private boolean success;
    private String mensaje;
    private String error;
    private T response;
}

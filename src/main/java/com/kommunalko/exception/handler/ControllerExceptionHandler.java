package com.kommunalko.exception.handler;

import com.kommunalko.exception.BadRequestException;
import com.kommunalko.exception.InternalServerError;
import com.kommunalko.exception.NotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice(basePackages = "com.kommunalko.controller")
public class ControllerExceptionHandler {

    @ExceptionHandler(value = BadRequestException.class)
    public ModelAndView handleBadRequestException(HttpServletRequest request, Exception e){
        return createResponse("errors/badRequest", e);
    }

    @ExceptionHandler(value = InternalServerError.class)
    public ModelAndView handleInternalServerError(HttpServletRequest request, Exception e){
        return createResponse("errors/internalServerError", e);
    }

    @ExceptionHandler(value = NotFoundException.class)
    public ModelAndView handleNotFoundException(HttpServletRequest request, Exception e){
        return createResponse("errors/notFound", e);
    }

    private ModelAndView createResponse(String pageName, Exception e){
        ModelAndView modelAndView = new ModelAndView(pageName);
        modelAndView.addObject("error", e);
        return modelAndView;
    }
}

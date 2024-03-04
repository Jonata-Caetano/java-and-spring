package com.graphql.compras.graphql.scalar;

import com.graphql.compras.utils.DateUtils;
import graphql.language.StringValue;
import graphql.schema.Coercing;
import graphql.schema.CoercingParseLiteralException;
import graphql.schema.CoercingParseValueException;
import graphql.schema.CoercingSerializeException;
import graphql.schema.GraphQLScalarType;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DateScalar extends GraphQLScalarType {
    private static final String NAME = "Date";

    private static final String INVALID_DATE = "Invalid Date: ";

    public DateScalar() {
        super(NAME, "Date type", new Coercing<Date, String>() {

            @Override
            public String serialize(Object input) {
                if (input instanceof Date) {
                    return DateUtils.toString((Date) input);
                }
                throw new CoercingSerializeException(INVALID_DATE + input);
            }

            @Override
            public Date parseValue(Object input) {
                if (input instanceof String) {
                    Date dt = DateUtils.toDate((String) input);
                    if (dt != null) {
                        return dt;
                    }
                }
                throw new CoercingParseValueException(INVALID_DATE + input);
            }

            @Override
            public Date parseLiteral(Object input) {
                if (!(input instanceof StringValue)) return null;
                String s = ((StringValue) input).getValue();
                Date dt = DateUtils.toDate(s);
                if (dt != null) {
                    return dt;
                }
                throw new CoercingParseLiteralException("Invalid Date: " + input);
            }
        });
    }
}

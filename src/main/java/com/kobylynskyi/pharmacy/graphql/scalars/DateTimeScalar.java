package com.kobylynskyi.pharmacy.graphql.scalars;

import graphql.language.StringValue;
import graphql.schema.Coercing;
import graphql.schema.GraphQLScalarType;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.stereotype.Component;

/**
 * @author bogdankobylinsky
 */
@Component
public class DateTimeScalar extends GraphQLScalarType {

    private static final Coercing DATE_TIME_COERCING = new Coercing() {
        @Override
        public String serialize(Object input) {
            return ((DateTime) input).toString(DateTimeFormat.fullDate());
        }

        @Override
        public Object parseValue(Object input) {
            return serialize(input);
        }

        @Override
        public DateTime parseLiteral(Object input) {
            if (input instanceof StringValue) {
                return DateTime.parse(((StringValue) input).getValue(), DateTimeFormat.fullDate());
            } else {
                return null;
            }
        }
    };

    public DateTimeScalar() {
        super("DateTime", "DateTime Scalar", DATE_TIME_COERCING);
    }
}

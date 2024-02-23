package com.qnksoft.graphql;

import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

//@Configuration
public class GraphQLConfig {

    @Bean
    public GraphQL graphQL(GraphQLSchema graphQLSchema) {
        return GraphQL.newGraphQL(graphQLSchema).build();
    }

    @Bean
    public GraphQLSchema graphQLSchema() throws IOException {
        SchemaParser schemaParser = new SchemaParser();
        TypeDefinitionRegistry typeRegistry = new TypeDefinitionRegistry();

        // Cargar todos los archivos GraphQL
        typeRegistry.merge(schemaParser.parse(new ClassPathResource("graphql/Person/person.graphqls").getFile()));
        //typeRegistry.merge(schemaParser.parse(new ClassPathResource("graphql/schema2.graphqls").getFile()));
        // Agrega más archivos según sea necesario

        RuntimeWiring runtimeWiring = buildRuntimeWiring();

        return new SchemaGenerator().makeExecutableSchema(typeRegistry, runtimeWiring);
    }

    // Define tus resolvers y configuración de esquema GraphQL aquí
    private RuntimeWiring buildRuntimeWiring() {
        // ...
        return null;
    }
}

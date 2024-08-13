package com.example.EmployeeManagementSystem.config;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
basePackages = "com.example.repository.primary",
entityManagerFactoryRef = "primaryEntityManagerFactory",
transactionManagerRef = "primaryTransactionManager"
)
public class PrimaryDataSourceConfig {
@Primary
@Bean(name = "primaryDataSource")
@ConfigurationProperties(prefix = "spring.datasource.primary")
public DataSource primaryDataSource() {
return DataSourceBuilder.create().build();
}
@Primary
@Bean(name = "primaryEntityManagerFactory")
public LocalContainerEntityManagerFactoryBean primaryEntityManagerFactory(
EntityManagerFactoryBuilder builder, @Qualifier("primaryDataSource") DataSource dataSource) {
return builder
.dataSource(dataSource)
.packages("com.example.entity.primary")
.persistenceUnit("primary")
.build();
}
@Primary
@Bean(name = "primaryTransactionManager")
public PlatformTransactionManager primaryTransactionManager(
@Qualifier("primaryEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
return new JpaTransactionManager(entityManagerFactory);
}
}